package Utils;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @ClassName: LambdaUtils
 * @Description:
 * @author: Nan
 * @date: 2020/9/1 17:39
 * @version: V1.0
 */

public class LambdaUtils {

    public static <T> Consumer<T> consumerWithIndex(BiConsumer<T, Integer> consumer){
        class Obj{
            int i;
        }

        Obj obj = new Obj();
        return t -> {
            int indes=obj.i++;
            consumer.accept(t,indes);
        };

    }

}
