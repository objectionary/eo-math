package EOorg.EOeolang.EOmath;

import EOorg.EOeolang.EOmath.EOangle$EOcos;
import org.eolang.Data;
import org.eolang.Dataized;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link EOangle}
 */
public final class EOangleEOcosTest {

    @Test
    public void cosZero() {
        final double result = Math.cos(0);
        MatcherAssert.assertThat(
            new Dataized(
                new EOangle$EOcos(
                    new Data.ToPhi((double) 0)
                )
            ).take(Double.class),
            Matchers.equalTo(result)
        );
    }

    @Test
    public void cosPi() {
        final double result = Math.cos(Math.PI);
        MatcherAssert.assertThat(
            new Dataized(
                new EOangle$EOcos(
                    new Data.ToPhi(Math.PI)
                )
            ).take(Double.class),
            Matchers.equalTo(result)
        );
    }

    @Test
    public void cosPiDivTwo() {
        final double result = Math.cos(Math.PI / 2);
        MatcherAssert.assertThat(
            new Dataized(
                new EOangle$EOcos(
                    new Data.ToPhi(Math.PI / 2)
                )
            ).take(Double.class),
            Matchers.equalTo(result)
        );
    }

    @Test
    public void cosMinusPiDivTwo() {
        final double result = Math.cos(-Math.PI / 2);
        MatcherAssert.assertThat(
            new Dataized(
                new EOangle$EOcos(
                    new Data.ToPhi(-Math.PI / 2)
                )
            ).take(Double.class),
            Matchers.equalTo(result)
        );
    }
}
