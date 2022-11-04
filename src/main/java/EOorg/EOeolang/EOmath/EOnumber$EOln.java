/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 Max Trunnikov
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
 * SOFTWARE
 */
// @checkstyle PackageNameCheck (1 line)
package EOorg.EOeolang.EOmath;

import EOorg.EOeolang.EOfloat;
import org.eolang.AtComposite;
import org.eolang.AtFree;
import org.eolang.Data;
import org.eolang.ExFailure;
import org.eolang.Param;
import org.eolang.PhDefault;
import org.eolang.Phi;
import org.eolang.XmirObject;

/**
 * Ln.
 *
 * @checkstyle TypeNameCheck (100 lines)
 * @since 0.23
 */
@XmirObject(oname = "number.ln")
public final class EOnumber$EOln extends PhDefault {

    /**
     * Ctor.
     *
     * @param sigma The \sigma
     * @checkstyle BracketsStructureCheck (200 lines)
     */
    public EOnumber$EOln(final Phi sigma) {
        super(sigma);
        this.add(
            "φ",
            new AtComposite(
                this,
                rho -> {
                    final Phi number = rho.attr("ρ").get();
                    final Object base = new Param(number, "n").weak();
                    final Phi phi;
                    if (base instanceof Double) {
                        final double self = (Double) base;
                        if (self < 0.0d) {
                            phi = new EOnan(sigma);
                        } else if (self == 0.0d) {
                            phi = new EOnegative_infinity(sigma);
                        } else if (self == 1.0d) {
                            phi = new Data.ToPhi(0.0d);
                        } else {
                            phi = new Data.ToPhi(Math.log(self));
                        }
                    } else if (base instanceof Long) {
                        final long self = (Long) base;
                        if (self < 0L) {
                            phi = new EOnan(sigma);
                        } else if (self == 0L) {
                            phi = new EOnegative_infinity(sigma);
                        } else if (self == 1L) {
                            phi = new Data.ToPhi(0L);
                        } else {
                            phi = new Data.ToPhi(Math.log(self));
                        }
                    } else {
                        throw new ExFailure(
                            String.format(
                                "Wrong number's %s argument in number.ln operation",
                                base
                            )
                        );
                    }
                    return phi;
                }
            )
        );
    }

}
