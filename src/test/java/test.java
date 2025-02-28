import com.example.lamdethithu.Bai1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void testTonSoDuong() {
        Bai1 tt = new Bai1();
        Assertions.assertEquals(9, tt.KiemThuTinhTong(2, 3, 4));
    }
    @Test
    public void testTonSoAm() {
        Bai1 tt = new Bai1();
        Assertions.assertEquals(-9, tt.KiemThuTinhTong(-2, -3, -4));
    }
    @Test
    public void testBangkh() {
        Bai1 tt = new Bai1();
        Assertions.assertEquals(0, tt.KiemThuTinhTong(-2, 2, 0));
    }
    @Test
    public void testMphanTu() {
        Bai1 tt = new Bai1();
        Assertions.assertEquals(5, tt.KiemThuTinhTong(5));
    }
    @Test
    public void loiKhoangTrang(){
        Bai1 tt = new Bai1();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            {tt.KiemThuTinhTong();}
        });
    }
}
