<%-- 
    Document   : menu
    Created on : 02.11.2021, 10:30:21
    Author     : Albu Catalina
--%>

<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="href="${pageContext.request.contextPath}"">Parking Lot</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav me-auto mb-2 mb-md-0">
          <li class="nav-item">
            <a class="nav-link ${pageContext.request.requestURI eq '/ParkingLot/about.jsp' ? 'active' : ''}" href="${pageContext.request.contextPath}/about.jsp">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled">Disabled</a>
          </li>
        </ul>
          <ul class="navbar-nav d-flex">
              <li class="nav-item">
                  <a class="nav-link" href="${pageContext.request.contextPath}/Login">Login</a>
              </li>
          </ul>
      </div>
    </div>
  </nav>