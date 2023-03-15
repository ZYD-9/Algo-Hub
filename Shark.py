class Shark :
    def __init__(self, name ,age):
        self.name = name
        self.age = age 

    callSign =  'Sugar Plum'
    location = 'South sea'

    def set_followers(self,followers):
        print ("This girls has " + str(followers) + "followers")  

   
   
girl = Shark('Hanni' , 21)
print(girl.name)
print(girl.callSign)
mae = Shark('Dari',20)
print(mae.age)
girl.set_followers(100)
print(mae.location)

    
        

