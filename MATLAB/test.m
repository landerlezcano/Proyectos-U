clc;
clear all;
close all;
t=linspace(-10,10,200);
r1=(1+(-1*cos(t)))./(6*(-1));
r2=(1+(2*cos(t)))./(4*2);
hold on;
polar(t,r1,'r--');
polar(t,r2,'g--');
hold off;
title('Cónicos')
legend('(1+(-1*cos(t)))./(6*(-1))','(1+(2*cos(t)))./(4*2)')