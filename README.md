# Moola Compiler
In this project we implemented a compiler for Moola programming language.<br>
Grammar was written using **Antlr**.<br>
Project consists of three main phases:

## Phase 1: Program printer
Walk through the program tree and print properties of each part including classes, methods, vars, class fields, ...

### Input:
```
//this is a area calculator app

class Shape:
    public field color string;
    /*
    *
    * override this method in child classes
    *
    */
    function calculateArea() returns int :
        return 0;
    end

    function compare(shape2: Shape) returns int:
        var selfArea = self.calculateArea();
        var otherArea = shape2.calculateArea();
        if(selfArea == otherArea)
            return 0;
        elif(selfArea > otherArea)
            return 1;
        else
            return -1;
    end
end

class Rectangle inherits Shape:
    public field width, height int;

    function calculateArea() returns int :
        return width * height;
    end

end

class Circle inherits Shape:
    public field radius int;

    function calculateArea() returns int :
        var pi = 3;
        return pi * radius * radius;
    end
end


entry class MainClass:
    function main() returns int :

        var rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 30;
        print("rectangle area: ");
        print(rectangle.calculateArea());

        var circle = new Circle();
        circle.radius = 4;
        print("circle area: ");
        print(circle.calculateArea());
    end
end
```

### Output:
```
program start{
    class: Shape{
        filed: color/ type=string/ access modifier=public
        class method: calculateArea/ return type=int/ access modifier=public{
        }
        class method: compare/ return type=int/ access modifier=public{
            var: selfArea
            var: otherArea
        }
    }
    class: Rectangle/ class parent: (Shape){
        filed: width/ type=int/ access modifier=public
        filed: height/ type=int/ access modifier=public
        class method: calculateArea/ return type=int/ access modifier=public{
        }
    }
    class: Circle/ class parent: (Shape){
        filed: radius/ type=int/ access modifier=public
        class method: calculateArea/ return type=int/ access modifier=public{
            var: pi
        }
    }
    main class: MainClass{
        class method: main/ return type=int/ access modifier=public{
            var: rectangle
            var: circle
        }
    }
}
```

## Phase 2: Semantic analysis
Generating symbol tables of program blocks and storing them in a tree structure.
### Input
```
class A inherits A1:
    public field f1,f2,f3,f4 int;
    field f1 bool;

    function foo(input1: int, input2: bool, input3: notFoundClass) returns string:
        var result = "", result = "hello";
        if(input2 == true) begin
            var t = 20;
            while(input1>0) begin
                var x = 10;
                result = result + "again";
                input2 = input2 - 1;
            end
        end
        elif(input1 == 10) begin

           begin

           end

        end

        else ;
        return result;
    end
end

class B inherits A:
   public field arr int[];
   field arr int;

   private function doIt(a: A[]) returns Any:
        arr[0] = a.f1;
        arr[1] = a.f2;
        arr[2] = a.f3;

        print(a.foo());

        var x = g(10, 20);
   end

   public function x(a: int, b: int) returns int:
        var x = new N();
        var c = 0
        if(a)
            if(b) var x = 0;
            else
                while(d)
                    if(c)
                        var y = 0;

   end
   public function x(a: int, b: int) returns int:
   end
end

class B:

end


entry class MyClass:
    field a A;
    function main() returns int:
        a = new A();
        var b = new B();
        var temp = b.doIt(a);

        return 0;
    end
end


class A1:
end


class A2 inherits A3:

end

class A3 inherits A4:

end

class A4 inherits A2:

end
```

### Output
```
-------------- Program : 1 --------------
Key = class_B_57_6 | Value = Class: (name: B) (is Entry: false) (inherits: Any)
Key = class_A4 | Value = Class: (name: A4) (is Entry: false) (inherits: A2)
Key = class_A3 | Value = Class: (name: A3) (is Entry: false) (inherits: A4)
Key = class_A2 | Value = Class: (name: A2) (is Entry: false) (inherits: A3)
Key = class_MyClass | Value = Class: (name: MyClass) (is Entry: true) (inherits: Any)
Key = class_B | Value = Class: (name: B) (is Entry: false) (inherits: A)
Key = class_A1 | Value = Class: (name: A1) (is Entry: false) (inherits: Any)
Key = class_A | Value = Class: (name: A) (is Entry: false) (inherits: A1)
----------------------------------------

-------------- Class: A : 1 --------------
Key = method_foo | Value = Method: (name: null) (return type: string) (accessModifier: public) (parameters type: int,bool,notFoundClass)
Key = field_f1f1_3_10 | Value = Field: (name: f1) (type: bool) (accessModifier: private)
Key = field_f4 | Value = Field: (name: f4) (type: int) (accessModifier: public)
Key = field_f3 | Value = Field: (name: f3) (type: int) (accessModifier: public)
Key = field_f2 | Value = Field: (name: f2) (type: int) (accessModifier: public)
Key = field_f1 | Value = Field: (name: f1) (type: int) (accessModifier: public)
----------------------------------------

-------------- Method: foo : 5 --------------
Key = input_input3 | Value = MethodInput: (name: input3) (type: notFoundClass)
Key = input_input2 | Value = MethodInput: (name: input2) (type: bool)
Key = var_result | Value = Var: (name: result)
Key = input_input1 | Value = MethodInput: (name: input1) (type: int)
Key = var_result_6_25 | Value = Var: (name: result)
----------------------------------------

-------------- if : 7 --------------
Key = var_t | Value = Var: (name: t)
----------------------------------------

-------------- While : 9 --------------
Key = var_x | Value = Var: (name: x)
----------------------------------------

-------------- elif : 15 --------------
----------------------------------------

-------------- Block : 17 --------------
----------------------------------------

-------------- else : 23 --------------
----------------------------------------

-------------- Class: B : 28 --------------
Key = field_arr | Value = Field: (name: arr) (type: int[]) (accessModifier: public)
Key = method_doIt | Value = Method: (name: null) (return type: Any) (accessModifier: private) (parameters type: A)
Key = method_x | Value = Method: (name: null) (return type: int) (accessModifier: public) (parameters type: int,int)
Key = method_x_53_19 | Value = Method: (name: null) (return type: int) (accessModifier: public) (parameters type: int,int)
Key = field_arrarr_30_9 | Value = Field: (name: arr) (type: int) (accessModifier: private)
----------------------------------------

-------------- Method: doIt : 32 --------------
Key = input_a | Value = MethodInput: (name: a) (type: A)
Key = var_x | Value = Var: (name: x)
----------------------------------------

-------------- Method: x : 42 --------------
Key = input_b | Value = MethodInput: (name: b) (type: int)
Key = input_a | Value = MethodInput: (name: a) (type: int)
Key = var_c | Value = Var: (name: c)
Key = var_x | Value = Var: (name: x)
----------------------------------------

-------------- if : 46 --------------
----------------------------------------

-------------- if : 46 --------------
Key = var_x | Value = Var: (name: x)
----------------------------------------

-------------- else : 48 --------------
----------------------------------------

-------------- While : 48 --------------
----------------------------------------

-------------- if : 50 --------------
Key = var_y | Value = Var: (name: y)
----------------------------------------

-------------- Method: x : 53 --------------
Key = input_b | Value = MethodInput: (name: b) (type: int)
Key = input_a | Value = MethodInput: (name: a) (type: int)
----------------------------------------

-------------- Class: B : 57 --------------
----------------------------------------

-------------- Class: MyClass : 62 --------------
Key = method_main | Value = Method: (name: null) (return type: int) (accessModifier: public) (parameters type: )
Key = field_a | Value = Field: (name: a) (type: A) (accessModifier: private)
----------------------------------------

-------------- Method: main : 64 --------------
Key = var_temp | Value = Var: (name: temp)
Key = var_b | Value = Var: (name: b)
----------------------------------------

-------------- Class: A1 : 74 --------------
----------------------------------------

-------------- Class: A2 : 78 --------------
----------------------------------------

-------------- Class: A3 : 82 --------------
----------------------------------------

-------------- Class: A4 : 86 --------------
----------------------------------------
```

## Phase 3: Errors
Find errors in program such as:
- Undefined class
- Undefined field or local variable
- Inheritance loop
- Repeated class definition
- Repeated method definition
- Repeated local variable definition (checks parent blocks)
- Repeated class field definition (checks parent classes)

### Input
same as input in phase 2

### Output
```
Error104 : in line 3:10 , field f1 has been defined already
Error103 : in line 6:25 , var result has been defined already
Error104 : in line 30:9 , field arr has been defined already
Error102 : in line 53:19 , method x has been defined already
Error101 : in line 57:6 , class B has been defined already
Error410 : in line 78:0 , Invalid inheritance A2 -> A3 -> A4 -> A2
Error410 : in line 82:0 , Invalid inheritance A3 -> A4 -> A2 -> A3
Error410 : in line 86:0 , Invalid inheritance A4 -> A2 -> A3 -> A4
Error105 : in line 5:52 , cannot find class notFoundClass
Error107 : in line 39:16 , in line 39:16, Can not find Method g
Error105 : in line 43:20 , cannot find class N
Error106 : in line 48:22 , in line 48:22, Can not find Variable d
```
