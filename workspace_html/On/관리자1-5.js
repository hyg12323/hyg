document.addEventListener('DOMContentLoaded', function() {
    // ▼ 드롭다운 공통
    document.querySelectorAll('.admin5-dropdown').forEach(dropdown => {
        const btn = dropdown.querySelector('.admin5-dropdown-btn');
        const menu = dropdown.querySelector('.admin5-dropdown-menu');
        if (btn && menu) {
            btn.addEventListener('click', function(event) {
                event.stopPropagation();
                document.querySelectorAll('.admin5-dropdown-menu').forEach(otherMenu => {
                    if (otherMenu !== menu) otherMenu.classList.remove('show');
                });
                menu.classList.toggle('show');
            });
        }
    });
    window.addEventListener('click', function(event) {
        if (!event.target.matches('.admin5-dropdown-btn')) {
            document.querySelectorAll('.admin5-dropdown-menu.show').forEach(menu => {
                menu.classList.remove('show');
            });
        }
    });

    // ▼ 차트 로직
    const barCtx = document.getElementById('myBarChart');
    let myChart;
    let currentView = 'totalMatches';
    let currentPeriod = 'week';

    const labels = {
        day: Array.from({ length: 7 }, (_, i) => `8월 ${i + 1}일`),
        week: ['7월 1주', '7월 2주', '7월 3주', '7월 4주', '8월 1주', '8월 2주', '8월 3주', '8월 4주'],
        month: Array.from({ length: 8 }, (_, i) => `${i + 1}월`),
        year: ['2022년', '2023년', '2024년', '2025년']
    };

    const chartConfigs = {
        totalMatches: {
            day: {
                type: 'bar',
                data: {
                    labels: labels.day,
                    datasets: [
                        { type: 'line', label: '추세선', data: [30, 40, 35, 50, 45, 55, 60], borderColor: 'red', tension: 0.4, order: 3 },
                        { label: '매칭', data: [25, 35, 30, 45, 40, 50, 55], backgroundColor: 'red', order: 1 },
                        { label: '매칭실패', data: [22, 30, 28, 40, 38, 45, 50], backgroundColor: 'black', order: 2 }
                    ]
                },
                options: {
                    plugins: { legend: { position: 'top' } },
                    scales: { x: { stacked: false }, y: { beginAtZero: true } }
                }
            },
            week: {
                type: 'bar',
                data: {
                    labels: labels.week,
                    datasets: [
                        { type: 'line', label: '추세선 A', data: [45, 55, 50, 65, 60, 70, 68, 75], borderColor: 'red', tension: 0.4, order: 3 },
                        { type: 'line', label: '추세선 B', data: [40, 50, 45, 60, 55, 65, 63, 70], borderColor: 'teal', tension: 0.4, order: 4 },
                        { label: '매칭', data: [40, 50, 45, 60, 55, 65, 63, 70], backgroundColor: 'red', order: 1 },
                        { label: '매칭실패', data: [42, 48, 42, 55, 50, 60, 58, 62], backgroundColor: 'black', order: 2 }
                    ]
                },
                options: { plugins: { legend: { display: false } } }
            },
            month: {
                type: 'bar',
                data: {
                    labels: labels.month,
                    datasets: [
                        { type: 'line', label: '추세선', data: [200, 250, 220, 300, 280, 350, 320, 400], borderColor: 'red', tension: 0.4, order: 3 },
                        { label: '매칭', data: [180, 230, 200, 280, 260, 330, 300, 380], backgroundColor: 'red', order: 1 },
                        { label: '매칭실패', data: [160, 210, 190, 250, 240, 310, 290, 360], backgroundColor: 'black', order: 2 }
                    ]
                },
                options: {
                    plugins: { legend: { position: 'top' } },
                    scales: { x: { stacked: false }, y: { beginAtZero: true } }
                }
            },
            year: {
                type: 'bar',
                data: {
                    labels: labels.year,
                    datasets: [
                        { type: 'line', label: '추세선', data: [2700, 3100, 2900, 3500], borderColor: 'red', tension: 0.4, order: 3 },
                        { label: '데이터셋 1', data: [2500, 3000, 2800, 3400], backgroundColor: 'red', order: 1 },
                        { label: '데이터셋 2', data: [2300, 2800, 2600, 3200], backgroundColor: 'black', order: 2 }
                    ]
                },
                options: {
                    plugins: { legend: { position: 'top' } },
                    scales: { x: { stacked: false }, y: { beginAtZero: true } }
                }
            }
        },

        matchCount: {
            day: {
                type: 'bar',
                data: {
                    labels: labels.day,
                    datasets: [
                        { label: '성공', data: [20, 30, 25, 40, 35, 45, 50], backgroundColor: 'blue' },
                        { label: '실패', data: [5, 5, 5, 5, 5, 5, 5], backgroundColor: 'red' }
                    ]
                },
                options: {
                    responsive: true,
                    plugins: { legend: { position: 'top' } },
                    scales: { x: { stacked: false }, y: { beginAtZero: true } }
                }
            },
            week: {
                type: 'bar',
                data: {
                    labels: labels.week,
                    datasets: [
                        { label: '성공', data: [150, 160, 155, 170, 165, 175, 180, 185], backgroundColor: 'blue' },
                        { label: '실패', data: [20, 25, 22, 30, 28, 35, 32, 40], backgroundColor: 'red' }
                    ]
                },
                options: {
                    responsive: true,
                    plugins: { legend: { position: 'top' } },
                    scales: { x: { stacked: false }, y: { beginAtZero: true } }
                }
            },
            month: {
                type: 'bar',
                data: {
                    labels: labels.month,
                    datasets: [
                        { label: '성공', data: [500, 550, 520, 600, 580, 650, 620, 700], backgroundColor: 'blue' },
                        { label: '실패', data: [50, 60, 55, 70, 65, 80, 75, 90], backgroundColor: 'red' }
                    ]
                },
                options: {
                    responsive: true,
                    plugins: { legend: { position: 'top' } },
                    scales: { x: { stacked: false }, y: { beginAtZero: true } }
                }
            },
            year: {
                type: 'bar',
                data: {
                    labels: labels.year,
                    datasets: [
                        { label: '성공', data: [6000, 7000, 6500, 8000], backgroundColor: 'blue' },
                        { label: '실패', data: [600, 700, 650, 800], backgroundColor: 'red' }
                    ]
                },
                options: {
                    responsive: true,
                    plugins: { legend: { position: 'top' } },
                    scales: { x: { stacked: false }, y: { beginAtZero: true } }
                }
            }
        },

        avgConnectTime: {
            day: {
                type: 'line',
                data: {
                    labels: labels.day,
                    datasets: [{ label: '평균 접속 시간(분)', data: [20, 22, 19, 25, 23, 28, 26], borderColor: 'green' }]
                }
            },
            week: {
                type: 'line',
                data: {
                    labels: labels.week,
                    datasets: [{ label: '평균 접속 시간(분)', data: [25, 28, 26, 30, 32, 35, 33, 38], borderColor: 'green' }]
                }
            },
            month: {
                type: 'line',
                data: {
                    labels: labels.month,
                    datasets: [{ label: '평균 접속 시간(분)', data: [30, 32, 29, 35, 33, 38, 36, 40], borderColor: 'green' }]
                }
            },
            year: {
                type: 'line',
                data: {
                    labels: labels.year,
                    datasets: [{ label: '평균 접속 시간(분)', data: [35, 38, 36, 42], borderColor: 'green' }]
                }
            }
        },

        avgMatchSuccessTime: {
            day: {
                type: 'bar',
                data: {
                    labels: labels.day,
                    datasets: [{ label: '평균 매칭 성공 시간(분)', data: [5, 6, 5.5, 7, 6.5, 8, 7.5], backgroundColor: 'purple' }]
                }
            },
            week: {
                type: 'bar',
                data: {
                    labels: labels.week,
                    datasets: [{ label: '평균 매칭 성공 시간(분)', data: [7, 8, 7.5, 9, 8.5, 10, 9.5, 11], backgroundColor: 'purple' }]
                }
            },
            month: {
                type: 'bar',
                data: {
                    labels: labels.month,
                    datasets: [{ label: '평균 매칭 성공 시간(분)', data: [10, 11, 10.5, 12, 11.5, 13, 12.5, 14], backgroundColor: 'purple' }]
                }
            },
            year: {
                type: 'bar',
                data: {
                    labels: labels.year,
                    datasets: [{ label: '평균 매칭 성공 시간(분)', data: [12, 13, 12.5, 15], backgroundColor: 'purple' }]
                }
            }
        },

        userRatio: {
            day: {
                type: 'bar',
                options: { scales: { x: { stacked: true }, y: { stacked: true } } },
                data: {
                    labels: labels.day,
                    datasets: [
                        { label: '요청자', data: [50, 55, 52, 60, 58, 65, 62], backgroundColor: 'orange' },
                        { label: '제공자', data: [40, 45, 42, 50, 48, 55, 52], backgroundColor: 'teal' }
                    ]
                }
            },
            week: {
                type: 'bar',
                options: { scales: { x: { stacked: true }, y: { stacked: true } } },
                data: {
                    labels: labels.week,
                    datasets: [
                        { label: '요청자', data: [300, 320, 310, 340, 330, 350, 360, 370], backgroundColor: 'orange' },
                        { label: '제공자', data: [250, 270, 260, 290, 280, 300, 310, 320], backgroundColor: 'teal' }
                    ]
                }
            },
            month: {
                type: 'bar',
                options: { scales: { x: { stacked: true }, y: { stacked: true } } },
                data: {
                    labels: labels.month,
                    datasets: [
                        { label: '요청자', data: [1200, 1300, 1250, 1400, 1350, 1500, 1450, 1600], backgroundColor: 'orange' },
                        { label: '제공자', data: [1000, 1100, 1050, 1200, 1150, 1300, 1250, 1400], backgroundColor: 'teal' }
                    ]
                }
            },
            year: {
                type: 'bar',
                options: { scales: { x: { stacked: true }, y: { stacked: true } } },
                data: {
                    labels: labels.year,
                    datasets: [
                        { label: '요청자', data: [15000, 16000, 15500, 17000], backgroundColor: 'orange' },
                        { label: '제공자', data: [12000, 13000, 12500, 14000], backgroundColor: 'teal' }
                    ]
                }
            }
        }
    };
    

    function renderChart() {
        const config = chartConfigs[currentView]?.[currentPeriod];
        if (!config) return;

        if (myChart) myChart.destroy();
        myChart = new Chart(barCtx, config);
    }

    const viewDropdown = document.querySelector('.admin5-chart-header .admin5-dropdown');
    viewDropdown.addEventListener('click', function(event) {
        if (event.target.tagName === 'A') {
            event.preventDefault();
            currentView = event.target.getAttribute('data-view');
            renderChart();
            viewDropdown.querySelector('.admin5-dropdown-btn').textContent = event.target.textContent + ' ▼';
        }
    });

    const dateDropdown = document.getElementById('admin5-date-dropdown');
    dateDropdown.addEventListener('click', function(event) {
        if (event.target.tagName === 'A') {
            event.preventDefault();
            currentPeriod = event.target.getAttribute('data-period');
            renderChart();
            dateDropdown.querySelector('.admin5-dropdown-btn').textContent = event.target.textContent + ' ▼';
        }
    });

    // 초기 로드
    renderChart();
    document.querySelector('.admin5-chart-header .admin5-dropdown-btn').textContent = '전체 매칭 횟수 ▼';
    document.getElementById('admin5-date-dropdown').querySelector('.admin5-dropdown-btn').textContent = '주 ▼';

    // ▼ 파이 차트
    const pieChartArea = document.getElementById('admin5-pie-chart-area');
    if (pieChartArea) {
        pieChartArea.innerHTML = '<canvas id="myPieChart"></canvas>';
        const pieCtx = document.getElementById('myPieChart');
        new Chart(pieCtx, {
            type: 'pie',
            data: {
                labels: ['시간 착각', '불친절', '위치 실수', '요구 변경'],
                datasets: [{
                    label: '매칭 실패 사유',
                    data: [74, 67, 44, 34],
                    backgroundColor: ['#FF9800', '#F44336', '#9C27B0', '#3F51B5'],
                    hoverOffset: 4
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                plugins: {
                    legend: {
                        position: 'bottom',
                        labels: { padding: 20, font: { size: 14 } }
                        
                    }
                    
                }
                
            }
        });
    }
});

