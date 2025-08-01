document.addEventListener('DOMContentLoaded', function() {

    // --- 상단 버튼 기능들 ---
    const searchInput = document.getElementById('search-id');
    const searchBtn = document.querySelector('.search-btn');
    const resetBtn = document.getElementById('reset-btn');
    const masterResetBtn = document.getElementById('master-reset-btn');
    const userListBody = document.querySelector('#user-list .div-body');
    const requestListBody = document.querySelector('#request-list .div-body'); // 💡 요청 목록 body 선택

    // 검색 기능
    if (searchBtn && searchInput) {
        searchBtn.addEventListener('click', function() {
            const searchTerm = searchInput.value.trim().toLowerCase();
            const userRows = userListBody.querySelectorAll('.div-row');
            userRows.forEach(row => {
                const idCell = row.querySelector('.col-id');
                if (idCell) {
                    const userId = idCell.textContent.trim().toLowerCase();
                    if (searchTerm === '' || userId.includes(searchTerm)) {
                        row.style.display = 'flex';
                    } else {
                        row.style.display = 'none';
                    }
                }
            });
        });
    }

    // 검색 초기화 기능
    if (resetBtn && searchInput) {
        resetBtn.addEventListener('click', function() {
            searchInput.value = '';
            const userRows = userListBody.querySelectorAll('.div-row');
            userRows.forEach(row => {
                row.style.display = 'flex';
            });
        });
    }

    // 💡 전체 계정 및 요청 초기화 기능
    if (masterResetBtn && userListBody && requestListBody) {
        masterResetBtn.addEventListener('click', function() {
            if (confirm('정말로 모든 계정 및 요청 목록을 삭제하시겠습니까? 이 작업은 되돌릴 수 없습니다.')) {
                userListBody.innerHTML = ''; // 사용자 목록의 모든 내용을 지움
                requestListBody.innerHTML = ''; // 요청 목록의 모든 내용을 지움
                alert('모든 목록이 삭제되었습니다.');
            }
        });
    }

    // --- 기타 기능들 ---

    const requestData = {
        '병원에 가고 싶습니다.': { 아이디: 'ehdgus12', 나이: '35세', 이름: '김철수', 상태: '진행중' },
        '말동무가 필요해요!': { 아이디: 'woghd_123', 나이: '62세', 이름: '박영희', 상태: '종료' }
    };

    function closeAllDropdowns() {
        document.querySelectorAll('.sanction-dropdown, .filter-dropdown').forEach(dropdown => {
            dropdown.style.display = 'none';
        });
    }
    
    function filterRequestList(statusToShow) {
        const requestRows = document.querySelectorAll('#request-list .div-body .div-row');
        requestRows.forEach(row => {
            if (statusToShow === '전체 보기') {
                row.style.display = 'flex';
                return;
            }
            const statusCell = row.querySelector('.col-req-status span');
            const currentStatus = statusCell ? statusCell.textContent.trim() : '';
            if (currentStatus === statusToShow) {
                row.style.display = 'flex';
            } else {
                row.style.display = 'none';
            }
        });
    }

    window.addEventListener('click', () => {
        closeAllDropdowns();
    });

    const requestModal = document.getElementById('request-modal');
    const modalTitle = document.querySelector('#request-modal h2');
    const modalText = document.getElementById('modal-request-text');

    if (requestModal) {
        requestModal.addEventListener('click', function(event) {
            if (event.target === requestModal || event.target.classList.contains('close-btn')) {
                requestModal.style.display = 'none';
            }
        });
    }
    
    const mainContent = document.querySelector('.content');

    if (mainContent) {
        mainContent.addEventListener('click', function(event) {
            const target = event.target;

            const dropdownButton = target.closest('.sanction-btn, .filter-btn');
            if (dropdownButton) {
                event.stopPropagation();
                const dropdown = dropdownButton.nextElementSibling;
                if (!dropdown) return;
                const isVisible = dropdown.style.display === 'block';
                closeAllDropdowns();
                if (!isVisible) {
                    dropdown.style.display = 'block';
                }
                return;
            }

            const sanctionLink = target.closest('.sanction-dropdown a');
            if (sanctionLink) {
                event.preventDefault();
                const actionText = sanctionLink.textContent;
                const row = sanctionLink.closest('.div-row');
                const warningActions = ['경고', '1일정지', '7일정지'];
                if (warningActions.includes(actionText)) {
                    const warningsCell = row.querySelector('.col-warnings');
                    let currentWarnings = parseInt(warningsCell.textContent, 10);
                    warningsCell.textContent = (currentWarnings + 1) + '회';
                    alert(actionText + ' 처리 및 경고 횟수 1회가 추가되었습니다.');
                } 
                else if (actionText === '계정삭제') {
                    if (confirm('정말로 이 계정을 삭제하시겠습니까? 이 작업은 되돌릴 수 없습니다.')) {
                        row.remove();
                        alert('계정이 삭제되었습니다.');
                    }
                }
                closeAllDropdowns();
                return;
            }

            const filterLink = target.closest('.filter-dropdown a');
            if (filterLink) {
                event.preventDefault();
                const filterText = filterLink.textContent.trim();
                let statusToFilter = '';
                if (filterText === '현재진행중') {
                    statusToFilter = '진행중';
                } else if (filterText === '종료 목록') {
                    statusToFilter = '종료';
                } else {
                    statusToFilter = '전체 보기';
                }
                filterRequestList(statusToFilter);
                closeAllDropdowns();
                return;
            }

            const requestContentCell = target.closest('.request-content-cell');
            if (requestContentCell) {
                const requestText = requestContentCell.textContent.trim();
                const data = requestData[requestText];
                if (data) {
                    modalTitle.textContent = '요청 상세 정보';
                    modalText.innerHTML = `<b>요청내용:</b> ${requestText}<br><b>상태:</b> ${data.상태}<br><b>아이디:</b> ${data.아이디}<br><b>나이:</b> ${data.나이}<br><b>이름:</b> ${data.이름}`;
                } else {
                    modalTitle.textContent = '정보 없음';
                    modalText.innerHTML = `<b>요청내용:</b> ${requestText}<br><br>해당 요청에 대한 상세 정보가 없습니다.`;
                }
                requestModal.style.display = 'flex';
                return;
            }

            const mileageCell = target.closest('.mileage-cell');
            if (mileageCell) {
                if (target.classList.contains('modify-btn')) {
                    event.preventDefault();
                    if (mileageCell.classList.contains('editing')) return;
                    mileageCell.classList.add('editing');
                    const textSpan = mileageCell.querySelector('.mileage-text');
                    const currentPoints = parseInt(textSpan.textContent, 10) || 0;
                    mileageCell.dataset.originalValue = currentPoints;
                    const infoContainer = mileageCell.querySelector('.mileage-info');
                    infoContainer.innerHTML = '';
                    const editContainer = document.createElement('div');
                    editContainer.className = 'mileage-edit-container';
                    editContainer.innerHTML = `<div class="input-row"><input type="number" class="point-input-main" value="${currentPoints}"><button class="point-adjust-btn" data-amount="10">+10</button><button class="point-adjust-btn" data-amount="-10">-10</button></div><div class="button-row"><button class="save-btn">저장</button><button class="cancel-btn">취소</button></div>`;
                    mileageCell.appendChild(editContainer);
                }
                else if (target.classList.contains('point-adjust-btn')) {
                    const input = mileageCell.querySelector('.point-input-main');
                    let currentValue = parseInt(input.value, 10) || 0;
                    input.value = currentValue + (parseInt(target.dataset.amount, 10));
                }
                else if (target.classList.contains('save-btn')) {
                    const input = mileageCell.querySelector('.point-input-main');
                    const newPoints = input.value;
                    const infoContainer = document.createElement('div');
                    infoContainer.className = 'mileage-info';
                    infoContainer.innerHTML = `<span class="mileage-text">${newPoints}p</span><a href="#" class="modify-btn">수정</a>`;
                    mileageCell.innerHTML = '';
                    mileageCell.appendChild(infoContainer);
                    mileageCell.classList.remove('editing');
                    delete mileageCell.dataset.originalValue;
                    alert(`포인트가 ${newPoints}p로 수정되었습니다.`);
                }
                else if (target.classList.contains('cancel-btn')) {
                    const originalValue = mileageCell.dataset.originalValue;
                    const infoContainer = document.createElement('div');
                    infoContainer.className = 'mileage-info';
                    infoContainer.innerHTML = `<span class="mileage-text">${originalValue}p</span><a href="#" class="modify-btn">수정</a>`;
                    mileageCell.innerHTML = '';
                    mileageCell.appendChild(infoContainer);
                    mileageCell.classList.remove('editing');
                    delete mileageCell.dataset.originalValue;
                }
            }
        });
    }
});