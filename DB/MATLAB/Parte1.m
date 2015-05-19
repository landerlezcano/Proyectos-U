clc;
clear all;
disp('----------------------------------------------------------------------------');
disp('Primera parte - Aproximación de longitud de arco para una rosa de n pétalos.');
disp('----------------------------------------------------------------------------');
disp('A continuación ingrese un valor A y un valor B tales que A*Cos(B*alpha) ó A*Sin(B*alpha)')
a = input('Valor A:  ');
b = input('Valor B:  ');
disp('----------------------------------------------------------------------------');
func=input('A continuación ingrese "0" si desea que la rosa use Seno o "1" si desea que se use Coseno:  ');
disp('----------------------------------------------------------------------------');
numAprox=201;
diff=((2*pi)/(numAprox-1));
fi = linspace(0,(2*pi),numAprox);
n = zeros(1,numAprox);
result=zeros(1,numAprox);
par=2;
for aux = 2:(numAprox-1)
    if(mod(par,2)==0)
        n(aux)=4;
    else
        n(aux)=2;
    end
    par=par+1;
end
n(1)=1;
n(numAprox)=1;
if func == 0
    fprintf('Aproximando %d*Sin(%d*alpha)...\n',a,b);
    for aux = 1:numAprox
        pt1 = a*sin(b*fi(aux));
        pt2 = (a*b)*cos(b*fi(aux));
        result(aux)=sqrt((pt1.^2)+(pt2.^2));
    end
else
    fprintf('Aproximando %d*Cos(%d*alpha)...\n',a,b);
    for aux = 1:numAprox
        pt1 = a*cos(b*fi(aux));
        pt2 = -(a*b)*sin(b*fi(aux));
        result(aux)=sqrt((pt1.^2)+(pt2.^2));
    end   
end
for aux = 1:numAprox
    result(aux)=result(aux)*n(aux);
end
total = sum(result(:));    
total=(total)*(diff/3);
fprintf('Aproximando rosa de n pétalos con a=%d y b=%d, usando %d intervalos...\n',a,b,(numAprox-1));
disp('----------------------------------------------------------------------------');
disp('Resultado aproximado:');
disp(total);
input('Presione cualquier tecla para continuar...');
%-----------------------------------------------------------------------------------------------
%-----------------------------------------------------------------------------------------------
%-----------------Segunda parte, gráficas de rosas ---------------------------------------------
%-----------------------------------------------------------------------------------------------
%-----------------------------------------------------------------------------------------------
x1 = randi([2,20],1,10);
x2 = randi([2,20],1,10);
array1 = linspace(-pi,pi,200);
x =0;
for c = 1:10
    x=x+1;
    subplot(2,5,x);
    if ((mod((x+1),2)==0))
        array2 = x1(c)*cos(x2(c)*array1);
        polar(array1,array2);
        title([num2str(x1(c)),'*cos(',num2str(x2(c)),'*t)']);
    else
        array2 = x1(c)*sin(x2(c)*array1);
        polar(array1,array2);
        title([num2str(x1(c)),'*sin(',num2str(x2(c)),'*t)']);   
    end
end
    