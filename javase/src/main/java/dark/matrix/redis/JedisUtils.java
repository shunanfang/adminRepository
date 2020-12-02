package dark.matrix.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * User: Riley
 * Date: 2020/11/3
 * Description: Jedis个工具类  使用Jedis连接池获取Jedis对象
 */
public class JedisUtils {

    //创建Jedis连接池对象
    private static JedisPool jedisPool = null;

    //创建连接池
    public static JedisPool open(String host, Integer port){

        if(jedisPool == null){
            //使用JedisPool
            JedisPoolConfig  config = new JedisPoolConfig();

            //设置最大的Jedis实例数，默认是8
            config.setMaxTotal(13);

            //设置最大的空闲实例数，保证可以保留足够的连接，快速获取Jedis对象
            config.setMaxIdle(3);

            //检查获取的Jedis对象是否可用
            config.setTestOnBorrow(true);

            //创建Jedis连接
            jedisPool = new JedisPool(config,host,port);
        }

        return jedisPool;
    }

    //关闭连接池
    public static void close(){
        if(jedisPool != null){
            jedisPool.close();
        }
    }

    //获取Jedis
    public static Jedis getJedis(String host, Integer port){
        return open(host,port).getResource();
    }
}
