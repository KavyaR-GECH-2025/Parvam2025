from django.shortcuts import render, redirect
from . import models
from . import forms

def home(request):
    if request.method == "POST":
        employee_form = forms.EmployeeForm(request.POST)
        if employee_form.is_valid():
            employee_form.save()
            employee_form = forms.EmployeeForm()  # reset the form after saving
    else:
        employee_form = forms.EmployeeForm()
    employees = models.Employee.objects.all()  # retrieve all employees
    context = {"employees": employees, "employee_form": employee_form}
    return render(request, "home.html", context)

def edit_employee(request, id):
    employee = models.Employee.objects.get(id=id)
    if request.method == "POST":
        employee_form = forms.EmployeeForm(request.POST, instance=employee)
        if employee_form.is_valid():
            employee_form.save()
            return redirect("home")
    else:
        employee_form = forms.EmployeeForm(instance=employee)
    context = {"employee_form": employee_form}
    return render(request, "edit.html", context)

def delete_employee(request, id):
    employee = models.Employee.objects.get(id=id)
    if employee:
        employee.delete()
    return redirect("home")
