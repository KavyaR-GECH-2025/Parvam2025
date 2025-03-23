from django.db import models

class Employee(models.Model):
    name = models.CharField(max_length=200)
    phone_no = models.CharField(max_length=15)
    address = models.TextField()
    department = models.CharField(max_length=100)
    salary = models.DecimalField(max_digits=10, decimal_places=2)

    def __str__(self):
        return self.name
