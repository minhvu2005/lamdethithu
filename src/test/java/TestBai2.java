import com.example.lamdethithu.SinhVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBai2 {
    @Test
    public void test() {
        SinhVienService service = new SinhVienService();
        Assertions.assertEquals("Sinh Vien is Updated",service.updateSinhVien("SV01","abc"));
    }
}
