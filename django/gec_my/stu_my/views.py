from django.shortcuts import render, redirect
from . import models, forms



# Create your views here.

def home(request):
    if request.method == "POST":
        student_form = forms.StudentForm(request.POST)  # Consistent naming
        if student_form.is_valid():
            student_form.save()
            student_form = forms.StudentForm()  # Reset form after saving
    else:
        student_form = forms.StudentForm()

    students = models.Student.objects.all()  # Fetch all student records
    context = {
        "students": students,
        "student_form": student_form
    }  
    return render(request, "home.html", context)

# Edit Student
def edit(request, id):
    student = models.Student.objects.get(id=id)
    if request.method == "POST":
        std_forms = forms.StudentForm(request.POST, instance=student)
        if std_forms.is_valid():
            std_forms.save()
            return redirect(home)
    else:
        student_form = forms.StudentForm(instance=student)
        context = {"student_form": student_form}
        return render(request, 'edit.html', context)

def delete(request, id):
    student = models.Student.objects.get(id=id)
    if request.method == "POST":
        student.delete()
        return redirect(home)
    else:
        student_form = forms.StudentForm(instance=student)
        context = {"student_form": student_form}
        return render(request, 'delete.html', context)


def about(request):
    return render(request, "about.html")


def contact(request):
    # Your logic here
    return render(request, "contact.html")