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