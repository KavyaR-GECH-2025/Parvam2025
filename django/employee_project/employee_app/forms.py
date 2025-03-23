from django import forms
from . import models

class EmployeeForm(forms.ModelForm):
    class Meta:
        model = models.Employee
        fields = ["name", "phone_no", "address", "department", "salary"]
        widgets = {
            "name": forms.TextInput(
                attrs={"class": "form-control", "placeholder": "Enter employee's name"}
            ),
            "phone_no": forms.TextInput(
                attrs={"class": "form-control", "placeholder": "Enter phone number"}
            ),
            "address": forms.Textarea(
                attrs={"class": "form-control", "placeholder": "Enter address", "rows": 3}
            ),
            "department": forms.TextInput(
                attrs={"class": "form-control", "placeholder": "Enter department"}
            ),
            "salary": forms.NumberInput(
                attrs={"class": "form-control", "placeholder": "Enter salary"}
            ),
        }
