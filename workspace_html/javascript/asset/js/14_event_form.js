
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
        // 콜백을 화살표함수로 하면 this는 여전히 window로 유지됨
        document.querySelector('#parent')
        .addEventListener('click',function(event){
            console.log('부모 클릭')
            // event.target: 이벤트가 발생한 DOM 
            console.log('event.target:',event.target)
            
            // event.currentTarget :  이벤트가 적용된 
            console.log('event.currentTarget:',event.currentTarget)

            // DOM.parent
            console.log('event.target.parentNode',event.target.parentNode)
            console.log('event.target.parentNode.parentNode',event.target.parentNode.parentNode)

             //이벤트 안에서 this는
           //더이상 window가 아니다
           // js에서 this는 뭔지 알고 있을 때만 사용하세요
            console.log(this)
            console.log(this == event.currentTarget)
        },true)
        // document.querySelector('#child1')
        // .addEventListener('click',function(event){
             
        //     // 전파 방지
        //     //부모로 전달되는 이벤트 중지
        //     // this 배우기 위해 주석
        //     // event.stopPropagation()

        //     console.log('자식1 클릭')
          
        // })
        // this : window 객체를 가지고 있다
        console.log( '밖',this)
        console.log('밖',this === window)












        
        // const chks = document.querySelectorAll('.chk')
        //   for(let i =0; i< chks.length; i++){
        // chks[i].addEventListener('click',()=>{
        //  console.log('선택:',chks[i].value)
        
        //   })


        // }
    //     const bt = document.querySelector('.bt'); 
    //     const chks = document.querySelectorAll('.chk');
    //     const result = document.querySelector('.text');

    //     bt.addEventListener('click', () => {
    //     const selected = [];

    //     chks.forEach(che1 => {
    //         if (che1.checked) {
    //             selected.push(che1.value);
    //         }
    //     });

    //     if (selected.length > 0) {
    //         result.textContent = '토핑 : ' + selected.join(', ');
    //     } else {
    //         result.textContent = '노선택';
    //     }
    // });
   
    // const all = document.querySelectorAll('.chk',()=>{
    //       const ab = Array.from(all)
    //       .
          

    //      // 유사배열을 진짜 배열로 만들어주는게 array.from 
    //      // array.from으로 변환후 map(찐 배열을 바꿔주거나 선택) 
    //      //  filter사용 가능해짐
    //     // 유사 배열엔 넣을수 없음 map()     
    // })

   



}
