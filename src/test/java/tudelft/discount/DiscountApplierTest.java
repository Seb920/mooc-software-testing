package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountApplierTest {

    @Test
    void aplicarDescuentoHOME() {
        Product home = new Product("Mesa", 100.0, "HOME");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(home));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(90.0, home.getPrice(), 0.001);
    }

    @Test
    void aplicarDescuentoBUSINESS() {
        Product business = new Product("Laptop", 100.0, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(business));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(110.0, business.getPrice(), 0.001);
    }

    @Test
    void aplicarDescuentoAmbosProductos() {
        Product home = new Product("Mesa", 200.0, "HOME");
        Product business = new Product("Laptop", 200.0, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(home, business));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(180.0, home.getPrice(), 0.001);
        assertEquals(220.0, business.getPrice(), 0.001);
    }
}