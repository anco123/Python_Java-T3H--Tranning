from django.db import models

# Create your models here.


class Employee(models.Model):
    first_name = models.CharField(max_length=30)
    last_name = models.CharField(max_length=30)


class Pythonclass(models.Model):
    name = models.CharField(max_length=15)
    nickname = models.CharField(max_length=13)



class DjangoClass(models.Model):
    name = models.CharField(max_length=20)
    nickname = models.CharField(max_length=15)
    age = models.IntegerField()
    # cover = models.ImageField(upload_to='images/',null=True)
    
    def __str__(self):
        return self.name
    


class lopPython(models.Model):
    name = models.CharField(max_length=15)
    nickname = models.CharField(max_length=13)



   