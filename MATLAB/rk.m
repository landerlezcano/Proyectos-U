clc;
clear;

h=0.05;
xo=0;
xf=1.45;
yo=0;
uo=-1;
numIteraciones=round(((xf-xo)/h))+1;
func = @(x,y,u) (tanh(x)-u);
xi = xo:h:xf;

fx=zeros([1,numIteraciones]);

m1=zeros([1,numIteraciones]);
m2=zeros([1,numIteraciones]);
m3=zeros([1,numIteraciones]);
m4=zeros([1,numIteraciones]);

k1=zeros([1,numIteraciones]);
k2=zeros([1,numIteraciones]);
k3=zeros([1,numIteraciones]);
k4=zeros([1,numIteraciones]);
yi=zeros([1,numIteraciones]);
ui=zeros([1,numIteraciones]);

for i=1:numIteraciones
    
    if i==1
        ui(1,1)=uo;
        yi(1,1)=yo;
    end
    
    fx(1,i) = func(xi(1,i), yi(1,i), ui(1,i));
    m1(1,i) = h * ui(1,i);
    k1(1,i) = h * fx(1,i);
    m2(1,i) = h * ((ui(1,i))+((1/2)*k1(1,i)));
    k2(1,i) = h * func(xi(1,i)+((1/2)*h),yi(1,i)+((1/2)*(m1(1,i))),(1/2)*k2(1,i));
    m3(1,i) = h * (ui(1,i)+((1/2)*k2(1,i)));
    k3(1,i) = h * func(xi(1,i)+((1/2)*h),yi(1,i)+((1/2)*m2(1,i)),ui(1,i)+((1/2)*k2(1,i)));
    m4(1,i) = h *(ui(1,i)+k3(1,i));
    k4(1,i) = h * func(xi(1,i)+h,yi(1,i)+m3(1,i),ui(1,i)+k3(1,i));

    if i~=(numIteraciones)
    	yi(1,i+1) = yi(1,i) + ((1/6)*(m1(1,i)+(2*m2(1,i))+(2*m3(1,i))+m4(1,i)));
    	ui(1,i+1) = ui(1,i) + ((1/6)*(k1(1,i)+(2*k2(1,i))+(2*k3(1,i))+k4(1,i)));
    end

end

disp(yi(1,numIteraciones));
