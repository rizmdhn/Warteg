/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import warteg.Order;

/**
 *
 * @author Felix
 */
public class OrderTest {
    int harga[]={3000,8000,3000,4000,7000,10000,4000,9000,7000,1000,3000,4000,1000,2000};
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void hitungnasi(){
        System.out.println("hitung nasi");
        int qtynasi = 1;   
        Order instance = new Order();
        int expresult = 3000;
        double result = instance.hitungnasi(qtynasi);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungayam(){
        System.out.println("hitung ayam");
        int qtyayam = 1;   
        Order instance = new Order();
        int expresult = 8000;
        int result = instance.hitungayam(qtyayam);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungudang(){
        System.out.println("hitung udang");
        int qtyudang = 1;   
        Order instance = new Order();
        int expresult = 7000;
        int result = instance.hitungudang(qtyudang);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungati(){
        System.out.println("hitung ati");
        int qtyati = 1;   
        Order instance = new Order();
        int expresult = 4000;
        int result = instance.hitungati(qtyati);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungcumi(){
        System.out.println("hitung cumi");
        int qtycumi = 1;   
        Order instance = new Order();
        int expresult = 7000;
        int result = instance.hitungcumi(qtycumi);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungkentang(){
        System.out.println("hitung kentang");
        int qtykentang = 1;   
        Order instance = new Order();
        int expresult = 4000;
        int result = instance.hitungkentang(qtykentang);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungempal(){
        System.out.println("hitung empal");
        int qtyempal = 1;   
        Order instance = new Order();
        int expresult = 9000;
        int result = instance.hitungempal(qtyempal);
        assertEquals(expresult, result, 0.0);
    }
    
    @Test
    public void hitungkerang(){
        System.out.println("hitung kerang");
        int qtykerang = 1;   
        Order instance = new Order();
        int expresult = 3000;
        int result = instance.hitungkerang(qtykerang);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungikan(){
        System.out.println("hitung ikan");
        int qtyikan = 1;   
        Order instance = new Order();
        int expresult = 10000;
        int result = instance.hitungikan(qtyikan);
        assertEquals(expresult, result, 0.0);
    }
     @Test
    public void hitungair(){
        System.out.println("hitung air");
        int qtyair = 1;   
        Order instance = new Order();
        int expresult = 1000;
        int result = instance.hitungair(qtyair);
        assertEquals(expresult, result, 0.0);
    }
     @Test
    public void hitungteh(){
        System.out.println("hitung teh");
        int qtyteh = 1;   
        Order instance = new Order();
        int expresult = 3000;
        int result = instance.hitungteh(qtyteh);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungkopi(){
        System.out.println("hitung kopi");
        int qtykopi = 1;   
        Order instance = new Order();
        int expresult = 4000;
        int result = instance.hitungkopi(qtykopi);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungkerupuk(){
        System.out.println("hitung kerupuk");
        int qtykerupuk = 1;   
        Order instance = new Order();
        int expresult = 1000;
        int result = instance.hitungkerupuk(qtykerupuk);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitunggorengan(){
        System.out.println("hitung gorengan");
        int qtygorengan = 1;   
        Order instance = new Order();
        int expresult = 2000;
        int result = instance.hitunggorengan(qtygorengan);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungkembalian(){
        System.out.println("hitung kembalian");
        float totalharga = 1000;
        float bayar = 2000;
        Order instance = new Order();
        int expresult = 1000;
        double result = instance.kembalian(bayar, totalharga);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void hitungtotal(){
        System.out.println("hitung total");
        int nasi = 3000;
        int ayam = 8000;
        int kerang = 3000 ;
        int ati = 4000;
        int cumi = 7000;
        int ikan = 10000;
        int kentang = 4000;
        int empal = 9000;
        int udang = 7000;
        int air = 1000;
        int teh = 3000;
        int kopi = 4000;
        int kerupuk = 1000;
        int gorengan = 2000;  
        Order instance = new Order();
        int expresult = 66000;
        double result = instance.Total(nasi, ayam, kerang, ati, cumi, ikan, kentang, empal, udang, air, teh, kopi, kerupuk, gorengan);
        assertEquals(expresult, result, 0.0);
    }
    @Test
    public void clear(){
        
        System.out.println("Clear Orderan");
        Order instance = new Order();
        String test = instance.clearorder();
        assertNull(test);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
