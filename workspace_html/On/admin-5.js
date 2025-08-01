// 막대 + 라인 그래프
const ctx = document.getElementById('barLineChart').getContext('2d');
new Chart(ctx, {
  data: {
    labels: ['5월', '6월', '7월', '8월'],
    datasets: [
      {
        type: 'bar',
        label: '성공 횟수',
        data: [12, 19, 25, 30],
        backgroundColor: 'black'
      },
      {
        type: 'bar',
        label: '실패 횟수',
        data: [6, 8, 7, 5],
        backgroundColor: 'red'
      },
      {
        type: 'line',
        label: '접속 시간',
        data: [30, 40, 50, 60],
        borderColor: 'green',
        borderWidth: 2,
        tension: 0.4,
        fill: false
      },
      {
        type: 'line',
        label: '응답 속도',
        data: [25, 35, 45, 55],
        borderColor: 'blue',
        borderWidth: 2,
        tension: 0.4,
        fill: false
      }
    ]
  },
  options: {
    responsive: true,
    plugins: { legend: { position: 'bottom' } },
    scales: { y: { beginAtZero: true } }
  }
});

// 파이 차트
const pie = document.getElementById('pieChart').getContext('2d');
new Chart(pie, {
  type: 'pie',
  data: {
    labels: ['시간 착각', '불친절', '위치 실수', '요구 변경'],
    datasets: [{
      label: '비율',
      data: [34, 32, 18, 16],
      backgroundColor: ['#ff9999', '#9999ff', '#99ffcc', '#ffff99']
    }]
  },
  options: {
    responsive: true,
    plugins: {
      legend: {
        position: 'bottom'
      }
    }
  }
});
