package dark.matrix.enums;

/**
 * User: 莱利
 * Date: 2020/10/30
 * Description:
 */
public class SinTest {
    public static void main(String[] args) {
        for(Sin sin:Sin.values()){
            System.out.println(sin.name()+":"+sin.getNum());
        }

        System.out.println(Sin.PROUD.getNum());

        Sin.PROUD.setNum(0);

        System.out.println(Sin.PROUD.getNum());
    }
}
