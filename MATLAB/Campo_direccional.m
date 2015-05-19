clc;
clear all;
close all;

% tomando la EDO en su forma estandar dy/dx = f(x,y)

% definici?n de los intervalos para t y para y
tval = -3:.2:3;
yval = -5:.2:5;

% definici?n de la funci?n f(t,y) 

func = @(t,y) ((t.^3 +y)/(-t));
% func = @(t,y) (t.^2 - y +2);

% definicion de la grilla de dibujo
[tm,ym]=meshgrid(tval,yval);
dt = tval(2) - tval(1); 
dy = yval(2) - yval(1);

% calculo de la funcion f(x,y) en cada punto de la grilla

yp = arrayfun(func, tm, ym);

% trazado de las lineas del campo direccional
s = 1./max(1/dt,abs(yp)./dy)*0.35;
h = ishold;

quiver(tval,yval,s,s.*yp,0,'.k'); 
hold on;
quiver(tval,yval,-s,-s.*yp,0,'.k');

if h
  hold on
else
  hold off
end
axis([tval(1)-dt/2,tval(end)+dt/2,yval(1)-dy/2,yval(end)+dy/2])

% calculo de varias soluciones de la EDO
hold on
% x = round(-8 + (8+8)*rand(10,1));
[ts,ys] = ode45(func,[1,7],0);
plot(ts,ys,'r','linewidth',3) ;
for i = -8:1:8
%     for(j=-5:2:5)
%         if(i==-2)
%            color = rand(1,3);
%            [ts,ys] = ode45(func,[i,8],round(-8 + (8+8)*rand));
%            plot(ts,ys,'Color',[color(1),color(2),color(3)]) ;
%         else 
%           color = rand(1,3);
%           [ts,ys] = ode45(func,[-2,8], i);
%           plot(ts,ys,'Color',[color(1),color(2),color(3)],'linewidth',2);
%         end
%     end
end
hold on;plot([0 0],ylim,'k');hold on;plot(xlim,[0 0],'k');
hold off
