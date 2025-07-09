
window.addEventListener('load',bind)
function bind(){
    document.querySelector('#keyword')
    .addEventListener('focus',()=>{
       const keyword = document.querySelector('#keyword')
    //    keyword.style.backgroundColor = 'red';
    })
    document.querySelector('#keyword')
    .addEventListener('blur',()=>{
       const keyword = document.querySelector('#keyword')
       keyword.style.backgroundColor = '';
})
document.querySelector('#keyword')
    .addEventListener('input',()=>{
       const keyword = document.querySelector('#keyword')

       const r = parseInt( Math.random() * 256)
       const g = parseInt( Math.random() * 256)
       const b = parseInt( Math.random() * 256)
       const a = Math.random()


       keyword.style.backgroundColor = `rgba(${r},${g},${b},${a})`;
})
        document.querySelector('#site')
        .addEventListener('change',()=>{
          
           const value =  document.querySelector('#site').value
           console.log('change 이벤트의 value',value)
            const form = document.querySelector('#form')
            if(value == 1){
                // naver
                //https://search.naver.com/search.naver
                form.setAttribute('action','https://search.naver.com/search.naver')

            }else if(value == 2){
                //gogle
                //https://search.gogle.com/search
                form.setAttribute('action','https://search.google.com/search?')
            }
        })
        document.querySelector('#form')
        .addEventListener('submit',(event)=>{
            // html 태그의 기본(고유) 기능을 막아줌
            // 여기서는 submit 기능 막음
           event.preventDefault()
           
           const value = document.querySelector('#keyword').value
           if(value.trim().length <2){
            alert('검색어는 두 글자 이상입니다')
           }else{
            // submit
              document.querySelector('#form').submit();
           }
        })
        addEventListener('copy',(event)=>{
            event.preventDefault();
            alert('복사 금지')
        })
         addEventListener('selectstart',(event)=>{
            event.preventDefault();
         
        })
        // const chks = document.querySelectorAll('.chk')
        //   for(let i =0; i< chks.length; i++){
        // chks[i].addEventListener('click',()=>{
        //  console.log('선택:',chks[i].value)
        
        //   })


        // }
        const bt = document.querySelector('.bt'); 
        const chks = document.querySelectorAll('.chk');
        const result = document.querySelector('.text');

        bt.addEventListener('click', () => {
        const selected = [];

        chks.forEach(che1 => {
            if (che1.checked) {
                selected.push(che1.value);
            }
        });

        if (selected.length > 0) {
            result.textContent = '토핑 : ' + selected.join(', ');
        } else {
            result.textContent = '노선택';
        }
    });

   



}
