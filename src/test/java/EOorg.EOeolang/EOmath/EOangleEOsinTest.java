package EOorg.EOeolang.EOmath;

import EOorg.EOeolang.EOmath.EOangle$EOsin;
import org.eolang.Data;
import org.eolang.Dataized;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link EOangle}
 */
public final class EOangleEOsinTest {

    @Test
    public void sin0() {
        final double result = Math.sin(0);
        MatcherAssert.assertThat(
            new Dataized(
                new EOangle$EOsin(
                    new Data.ToPhi((double) 0)
                )
            ).take(Double.class),
            Matchers.equalTo(result)
        );
    }

    @Test
    public void sinPi() {
        final double result = Math.sin(Math.PI);
        MatcherAssert.assertThat(
            new Dataized(
                new EOangle$EOsin(
                    new Data.ToPhi(Math.PI)
                )
            ).take(Double.class),
            Matchers.equalTo(result)
        );
    }

    @Test
    public void sinPiDiv2() {
        final double result = Math.sin(Math.PI / 2);
        MatcherAssert.assertThat(
            new Dataized(
                new EOangle$EOsin(
                    new Data.ToPhi(Math.PI / 2)
                )
            ).take(Double.class),
            Matchers.equalTo(result)
        );
    }

    @Test
    public void sinMinusPiDiv2() {
        final double result = Math.sin(-Math.PI / 2);
        MatcherAssert.assertThat(
            new Dataized(
                new EOangle$EOsin(
                    new Data.ToPhi(-Math.PI / 2)
                )
            ).take(Double.class),
            Matchers.equalTo(result)
        );
    }
}
