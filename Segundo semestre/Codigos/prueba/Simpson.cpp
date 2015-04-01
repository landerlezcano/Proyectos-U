/*
 * This software released freely into the public domain.  Anyone may copy,
 * modify, publish, use, compile, sell, or distribute this software, either
 * in source code form or as a compiled binary, for any purpose, commercial
 * or non-commercial, and by any means.  The software is provided "as is",
 * without warranty of any kind, express or implied.
 */

#include <sstream>
#include "Simpson.h"

using namespace std;

/**
 * Approximates the definite integral using Simpson's Rule.  The function
 * should be continuous in the range [a, b].  The specified number of
 * subintervals should be even, but the value is incremented if it isn't.
 *
 * @param df the function to be integrated
 * @param a  the lower bound of integration
 * @param b  the upper bound of integration
 * @param n  the number of subintervals to be used in computing the integral
 *
 * @return the value of the definite integral
 *
 * @throws invalid_argument if n < 0, n > 100,000, or b < a
 */
double integrate(DoubleFunction f, double a, double b, int n) throw(invalid_argument)
  {
    if (n < 0 || n > 100000)
      {
        ostringstream message;
        message << n << "out of range";
        throw invalid_argument(message.str());
      }
    else if (b < a)
      {
        ostringstream message;
        message << "a must be less than b; a =" << a << ", b = " << b;
        throw invalid_argument(message.str());
      }

    if (a == b)
        return 0;

    double x, deltaX, sum2 = 0.0, sum4;

    if (n % 2 != 0)   // make sure that n is even
        ++n;
    deltaX = (b - a)/n;
    x = a + deltaX;
    sum4 = f(x);

    for (int i = 1; i <= (n - 2)/2; ++i)
      {
        x = x + deltaX;
        sum2 = sum2 + f(x);
        x = x + deltaX;
        sum4 = sum4 + f(x);
      }

    return (deltaX/3.0)*(f(a) + f(b) + 4.0*sum4 + 2.0*sum2);
  }
