/*
 * This software released freely into the public domain.  Anyone may copy,
 * modify, publish, use, compile, sell, or distribute this software, either
 * in source code form or as a compiled binary, for any purpose, commercial
 * or non-commercial, and by any means.  The software is provided "as is",
 * without warranty of any kind, express or implied.
 */

#if !defined(FRACTION_H)
#define FRACTION_H

#include <stdexcept>

using namespace std;

typedef double DoubleFunction(double x);

double integrate(DoubleFunction f, double a, double b, int n)  throw(invalid_argument);

#endif
