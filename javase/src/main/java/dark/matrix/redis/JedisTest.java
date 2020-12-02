package dark.matrix.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * User: Riley
 * Date: 2020/11/3
 * Description: 测试redis连接
 */
public class JedisTest {

    //测试单元测试是否可用
    @Test
    public void test01(){
        System.out.println("测试！");
    }

    //测试Jedis
    @Test
    public void test02(){
        Jedis jedis = new Jedis("192.168.18.128",6379);

        System.out.println(jedis.lrange("sin",0,-1));
    }

    //测试jedis连接池是否可用
    @Test
    public void test03(){
        Jedis jedis = JedisUtils.getJedis("192.168.18.128",6379);

        System.out.println(jedis.lrange("sin",0,-1));
    }
}
