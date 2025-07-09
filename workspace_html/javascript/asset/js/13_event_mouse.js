let view
let isDown = false
window.onload = function(){
    view = document.querySelector("#view");

      const cursor = document.querySelector("#cursor");
      cursor.style.top = '-1000px';
      cursor.style.left = '-1000px';

    bind()
}
function bind(){
         view.innerHTML = '안녕?<br>'

         document.querySelector('#mouse')
         .addEventListener('mousedown',function(evt){
          
            view.innerHTML = 'mousedown 발생<br>'+ view.innerHTML

            console.log(evt)

          /*
                ofset : DOM의 최상단 기준
                page :  스크롤에 관계 없이 문서 최상단 기준
                client : 지금 보이는 화면 최상단 기준
          */
          


            view.innerHTML = `
           event.offsetX: ${evt.offsetX} event.offsetY: ${evt.offsetX}<br>
           event.pageX: ${evt.pageX} event.pageY: ${evt.pageX}<br>
           event.clientX: ${evt.pageX} event.clientY: ${evt.clientX}<br>

            ${view.innerHTML}
            `
         
            // offset 개념을 아니까 
            // 그 DOM으로 스크롤 바로 가기
            // window.scrollTo 

         })
         document.querySelector('#mouse')
         .addEventListener('mouseup',function(){
           
            view.innerHTML = 'mouseup 발생<br>'+ view.innerHTML
         })
         document.querySelector('#mouse')
         .addEventListener('mousemove',function(){
            // 확인 했는데 너무 복잡해서 주석
            // view.innerHTML = 'mousemove 발생<br>' + view.innerHTML
         })
         // 마우스 들어옴 mouseover 또는 mouseenter
         document.querySelector('#mouse')
         .addEventListener('mouseover',function(){
            view.innerHTML = 'mouseover 발생<br>' + view.innerHTML
            
            document.querySelector('#mouse').style.backgroundColor = 'yellow'
         })
         // 마우스 나감 mouseout 또는 mouseleave
          document.querySelector('#mouse')
         .addEventListener('mouseout',function(){
            view.innerHTML = 'mouseout 발생<br>' + view.innerHTML
             document.querySelector('#mouse').style.backgroundColor = 'white'
         })
         
           document.querySelector('body')
           .addEventListener('mousemove',function(evt){
            if(isDown){
               const cursor = document.getElementById('cursor');

               cursor.style.top = evt.pageY+1 + 'px';
               cursor.style.left = evt.pageX+1 + 'px';
            }
            })
            
           
}
