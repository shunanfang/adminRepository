package dark.matrix.enums;
/**
 * User: 莱利
 * Date: 2020/10/30
 * Description: 枚举类
 */
public enum  Sin {

    PROUD(1),
    GREED(2),
    LIE(3),
    ENVY(4),
    SLOTH(5),
    WRATH(6),
    HOPE(7);

    private int num;

    private Sin(int num) {
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }
}