from django.urls import path
from .import views

urlpatterns = [
    path("", views.home, name='home'),
    path("delete/<int:id>", views.delete, name='delete'),
    path("edit/<int:id>", views.edit, name='edit'),
    path("about",views.about),
    path("contact",views.contact),
]