<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>MES System - 대시보드</title>

  <!-- 로고용 폰트 -->
  <link href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap" rel="stylesheet">

  <!-- (옵션) Chart.js 사용 시 포함 -->
  <script src="https://cdn.jsdelivr.net/npm/chart.js@4.4.0/dist/chart.umd.min.js"></script>

  <style>
    /* ===== 본문 폰트 선언 (EliceDigitalBaeum) ===== */
    @font-face{
      font-family:'EliceDigitalBaeum';
      src:url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_220508@1.0/EliceDigitalBaeum_Regular.woff2') format('woff2');
      font-weight:400; font-style:normal; font-display:swap;
    }
    @font-face{
      font-family:'EliceDigitalBaeum';
      src:url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_220508@1.0/EliceDigitalBaeum_Bold.woff2') format('woff2');
      font-weight:700; font-style:normal; font-display:swap;
    }

    :root{
      --font-brand:'Pacifico', cursive;
      --font-body:'EliceDigitalBaeum',"Noto Sans KR","Apple SD Gothic Neo",system-ui,-apple-system,"Segoe UI",Roboto,Arial,sans-serif;

      --bg:#f3f6fc;
      --text:#111827;
      --muted:#6b7280;
      --card:#ffffff;
      --border:#e5e7eb;
      --primary:#2f6bff;
      --primary-700:#2457d6;
      --ring:#c7d2fe;
      --danger:#ef4444;

      --radius:16px;
      --shadow:0 12px 30px rgba(17,24,39,.08);
      --sidebar-w: 240px;
    }

    *{box-sizing:border-box}
    html,body{height:100%}
    body{
      margin:0; background:var(--bg); color:var(--text); font-family:var(--font-body);
      display:grid; grid-template-columns: var(--sidebar-w) 1fr; grid-template-rows: 64px 1fr;
      grid-template-areas:
        "sidebar header"
        "sidebar main";
    }

    /* 헤더 */
    .header{
      grid-area:header; background:var(--card); border-bottom:1px solid var(--border);
      display:flex; align-items:center; justify-content:space-between; padding:0 16px; box-shadow:var(--shadow);
    }
    .brand{ font-family:var(--font-brand); font-size:26px; letter-spacing:.5px; }
    .userbox{ display:flex; align-items:center; gap:12px; color:var(--muted); font-size:14px; }
    .logout-btn{
      height:36px; padding:0 12px; border-radius:10px; border:0; cursor:pointer;
      background:var(--primary); color:#fff; font-weight:700;
    }
    .logout-btn:hover{ background:var(--primary-700); }

    /* 사이드바 */
    .sidebar{
      grid-area:sidebar; background:#fff; border-right:1px solid var(--border); padding:16px 10px;
    }
    .menu-title{ font-weight:700; margin:8px 12px 6px; color:#374151; }
    .menu a{
      display:block; padding:10px 12px; border-radius:12px; color:#111827; text-decoration:none; font-weight:600;
    }
    .menu a:hover{ background:#f1f5ff; color:#1d4ed8; }
    .menu a.active{ background:#e7efff; color:#1d4ed8; }

    /* 메인영역 */
    .main{ grid-area:main; padding:18px; }
    .grid{
      display:grid; gap:16px;
      grid-template-columns: repeat(12, 1fr);
    }
    .card{
      background:var(--card); border:1px solid var(--border); border-radius:var(--radius); box-shadow:var(--shadow);
      padding:16px;
    }
    .kpi{ display:flex; align-items:center; justify-content:space-between; }
    .kpi h3{ margin:0 0 6px; font-size:14px; color:#6b7280; }
    .kpi .val{ font-size:24px; font-weight:800; }
    .kpi small{ color:#6b7280; }

    .table{ width:100%; border-collapse:collapse; font-size:14px; }
    .table th, .table td{ padding:10px 12px; border-top:1px solid var(--border); }
    .table thead th{ background:#f8fafc; text-align:left; }

    /* 반응형 */
    @media (max-width: 1024px){
      body{ grid-template-columns: 0 1fr; }
      .sidebar{ display:none; }
    }
  </style>
</head>
<body>

  <!-- 사이드바 -->
  <aside class="sidebar">
    <div class="menu-title">메뉴</div>
    <nav class="menu">
      <a href="#" class="active">대시보드</a>
      <a href="#">생산지시</a>
      <a href="#">작업실적</a>
      <a href="#">입·출고</a>
      <a href="#">불량관리</a>
      <a href="#">원자재 LOT</a>
      <a href="#">설비 관리</a>
      <a href="#">사용자</a>
    </nav>
  </aside>

  <!-- 헤더 -->
  <header class="header">
    <div class="brand">MES System</div>
    <div class="userbox">
      <span>
        <strong><c:out value="${sessionScope.loginUser.name}" default="Guest"/></strong>
        (<span>ID: <c:out value="${sessionScope.loginUser.user_id}" default="-"/></span>)
      </span>
      <!-- 로그아웃은 필요시 /logout 서블릿/매핑으로 변경 -->
      <form method="post" action="${pageContext.request.contextPath}/logout">
        <button type="submit" class="logout-btn">로그아웃</button>
      </form>
    </div>
  </header>

  <!-- 메인 -->
  <main class="main">
    <div class="grid">
      <!-- KPI 카드 4개 -->
      <section class="card" style="grid-column: span 3;">
        <div class="kpi">
          <div>
            <h3>오늘 생산지시</h3>
            <div class="val">12건</div>
            <small>어제 대비 +3건</small>
          </div>
        </div>
      </section>
      <section class="card" style="grid-column: span 3;">
        <div class="kpi">
          <div>
            <h3>금일 양품</h3>
            <div class="val">8,240 EA</div>
            <small>불량률 1.8%</small>
          </div>
        </div>
      </section>
      <section class="card" style="grid-column: span 3;">
        <div class="kpi">
          <div>
            <h3>설비 가동률</h3>
            <div class="val">92%</div>
            <small>목표 90%</small>
          </div>
        </div>
      </section>
      <section class="card" style="grid-column: span 3;">
        <div class="kpi">
          <div>
            <h3>재고(주요 원료)</h3>
            <div class="val">74%</div>
            <small>안전재고 상회</small>
          </div>
        </div>
      </section>

      <!-- 좌: 생산량 차트 / 우: 불량유형 차트 -->
      <section class="card" style="grid-column: span 7;">
        <h3 style="margin:0 0 8px;">주간 생산량</h3>
        <canvas id="barChart" height="120"></canvas>
      </section>

      <section class="card" style="grid-column: span 5;">
        <h3 style="margin:0 0 8px;">불량 유형 비율</h3>
        <canvas id="donutChart" height="120"></canvas>
      </section>

      <!-- 최근 생산지시 -->
      <section class="card" style="grid-column: span 12;">
        <h3 style="margin:0 0 8px;">최근 생산지시</h3>
        <table class="table">
          <thead>
            <tr>
              <th>지시번호</th>
              <th>제품</th>
              <th>수량</th>
              <th>마감일</th>
              <th>상태</th>
            </tr>
          </thead>
          <tbody>
            <!-- 실제 데이터 바인딩 시 c:forEach 사용 -->
            <tr>
              <td>PO-2025-0912</td>
              <td>콜라 500ml</td>
              <td>5,000</td>
              <td>2025-09-05</td>
              <td>진행중</td>
            </tr>
            <tr>
              <td>PO-2025-0911</td>
              <td>사이다 350ml</td>
              <td>3,000</td>
              <td>2025-09-05</td>
              <td>대기</td>
            </tr>
            <tr>
              <td>PO-2025-0910</td>
              <td>에이드 1.5L</td>
              <td>800</td>
              <td>2025-09-06</td>
              <td>계획</td>
            </tr>
            <tr>
              <td>PO-2025-0909</td>
              <td>토닉워터 500ml</td>
              <td>2,200</td>
              <td>2025-09-06</td>
              <td>완료</td>
            </tr>
            <tr>
              <td>PO-2025-0908</td>
              <td>탄산수 500ml</td>
              <td>1,600</td>
              <td>2025-09-07</td>
              <td>진행중</td>
            </tr>
          </tbody>
        </table>
      </section>
    </div>
  </main>

  <script>
    // ===== 차트 더미 데이터 (원하면 서버 데이터로 대체) =====
    if (window.Chart) {
      const ctx1 = document.getElementById('barChart');
      const bar = new Chart(ctx1, {
        type: 'bar',
        data: {
          labels: ['월','화','수','목','금','토','일'],
          datasets: [{
            label: '생산량 (EA)',
            data: [1200, 1500, 900, 1800, 2200, 1300, 1600],
            borderWidth: 1
          }]
        },
        options: {
          responsive: true,
          plugins: { legend: { display: true } },
          scales: { y: { beginAtZero: true } }
        }
      });

      const ctx2 = document.getElementById('donutChart');
      const donut = new Chart(ctx2, {
        type: 'doughnut',
        data: {
          labels: ['라벨불량','용량부족','캡불량','파손','기타'],
          datasets: [{
            label: '불량 비율',
            data: [35, 22, 18, 10, 15],
            borderWidth: 1
          }]
        },
        options: {
          responsive: true,
          plugins: { legend: { position: 'bottom' } },
          cutout: '60%'
        }
      });
    }
  </script>
</body>
</html>

