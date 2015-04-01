/*
 * This software released freely into the public domain.  Anyone may copy,
 * modify, publish, use, compile, sell, or distribute this software, either
 * in source code form or as a compiled binary, for any purpose, commercial
 * or non-commercial, and by any means.  The software is provided "as is",
 * without warranty of any kind, express or implied.
 */

#include <iostream>
#include <cmath>
#include <iomanip>
#include "simpson.h"

using namespace std;

int main()
  {
    double result = integrate(sin, 0, M_PI, 30);
    cout << setprecision(10) << "Using Simpson: Integral of sine from 0 to pi is " << result;
    return 0;
  }
