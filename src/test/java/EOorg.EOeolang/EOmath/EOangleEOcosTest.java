/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2021-2022 Max Trunnikov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
// @checkstyle PackageNameCheck (1 line)
package EOorg.EOeolang.EOmath;

import org.eolang.Data;
import org.eolang.Dataized;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link EOangle}
 *
 * @since 0.0.1
 * @checkstyle TypeNameCheck (100 lines)
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
