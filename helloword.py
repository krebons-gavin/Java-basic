# Python 3.3
# Filename: helloword.py
# Auther: Gavin
# Created: 2014-01-21, Gavin
# Last Update: 2014-06-10, Gavin

# 注意1：Python是大小写敏感的；
# 注意2：注释使用的是#号；

# 例1: Hello world
print('Hello World! Gavin');
print('2014-01-17, Sublime text Learning');
a=1;
if(a==1):
    print('a=1')
elif(a==2):
    print('a=2')
else:
    print('a=3')

# 例2：复利计算器
print('Example2: Interest Calculator')
principal=1000       	# 本金
rate=0.05				# 利率
numyears=5				# 期数：年
year=1
while year <= numyears:
	principal=principal*(1+rate)
	print(year,principal)
	year+=1

# 例3：基础学习
# http://maxburstein.com/blog/python-shortcuts-for-the-python-beginner/
# Inline if Statement
print ("hello") if True else "World"
