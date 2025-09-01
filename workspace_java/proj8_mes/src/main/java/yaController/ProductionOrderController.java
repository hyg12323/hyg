package yaController;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yaDAO.ProductionOrderDAO;
import yaDTO.Production_orderDTO;   

@WebServlet("/order")
public class ProductionOrderController extends HttpServlet {

    private ProductionOrderDAO dao = new ProductionOrderDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Production_orderDTO> orders = dao.getOrders();
        request.setAttribute("orders", orders);

        request.getRequestDispatcher("/WEB-INF/produ.jsp")
        .forward(request, response);
    }
}


