import csv
class Item:
    # class attributes 
    pay_rate = 0.20
    all = []
    def __init__(self, name:str, price:float,quantity = 0):
        
        assert price >=0,"Price is not greater or equal to Zero(0)"
        assert quantity >=0,"Quantity is not greater or equal to Zero(0)"
        #instance attributes
        self.name = name
        self.price = price
        self.quantity = quantity
        Item.all.append(self)

    def calculate_total_price (self):
        return (self.price * self.quantity)

    def get_price (self):
        self.price = float(input("Please input price"))
        return self.price
    
    def calculate_discount (self):
        self.price = self.price * self.pay_rate
    
    @staticmethod
    def is_integer(num):
        if isinstance(num, float):
            return num.is_integer()
        elif isinstance(num, int):
            return True
        else:
            return False

    def __repr__(self):
        return f"{self.__class__.__name__}('{self.name}','{self.price}',{self.quantity})"
    
    @classmethod
    def instantiate_from_csv(cls):
        with open('values.csv','r') as f:
            reader = csv.DictReader(f)
            items = list(reader)
        for i in items:
            Item(
                name=i.get('name'),
                price=float(i.get('price')),
                quantity = int(i.get('quantity'))
            )

# child class 
class Phone(Item):
    
    def __init__(self, name, price,quantity,new_phone):
       super().__init__(name, price, quantity)
       
       assert new_phone >=0,"Broken Phones is not greater or equal to Zero(0)"
       self.new_phone = new_phone

phone_1 = Phone("Nokia", 3000,2,4)
phone_2 = Phone("Apple",200.00,2,2)
print(Item.all)
print(Phone.all)




    














