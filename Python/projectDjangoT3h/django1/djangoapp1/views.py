from django.shortcuts import render
from django.http import HttpResponse
from .models import DjangoClass
from django.template import loader
from .forms import DjangoClassForm
from rest_framework import viewsets
from djangoapp1.serializers import DjangoClassSerializer


def post_comment(request, new_comment):
    if request.session.get('has_commented', False):
        return HttpResponse("You've already commented.")
    c = comments.Comment(comment=new_comment)
    c.save()
    request.session['has_commented'] = True
    return HttpResponse('Thanks for your comment!')



# Create your views here.
def home_page(request):
    request.session['has_commented'] = "Yes"


    return HttpResponse("<h1>Hello world</h1>")

def about_page(request):
    has_commented = request.session.get('has_commented', 'No')


    return HttpResponse("<h1>About Us" + has_commented + "</h1>")

def contact_page(request):
    return HttpResponse("<h1>Contact Us</h1>")

def index(request):
    # template = loader.get_template('insert.html')
    # name = 'students'
    # return HttpResponse(template.render(name))
    return render(request, 'in.html', {'students':'tuan'} )
    # return render(request,'in.html')
def extend_page(request):
    return render(request, 'about.html', {'title':'aboutsaassas'})
 
def django_class_view(request):
    obj = DjangoClass.objects.get(id=1)
    lst = DjangoClass.objects.values_list('nickname')
    context = {
        'name': obj.name,
        'nickname': obj.nickname,
        'age': obj.age,
        'lst': lst
        }
    return render(request,'djangoClass.html',(context))
        
    
        

def all_view(request):
    allObj = DjangoClass.objects.all()
    
    context = {
        # 'name':allObj.name,
        # 'nickname':allObj.nickname,
        # 'age':allObj.age,
        'allObj' : allObj
    }
    return render(request,'djangoClass.html',(context))

# def django_class_view(TemplateView):
#     maxId = DjangoClass.objects.count()
#     obj = DjangoClass.objects.get(id=1)

#     context = {
#         'name': obj.name,
#         'nickname': obj.nickname,
#         'age': obj.age
#     }
#     return render(request,'djangoClass.html',(context))

def forms_view(request):


    # form = request.POST.get('title')
    if request.method == "GET":
        my_new_title= request.POST.get('title')
        print(my_new_title)
    context= {}
    # if form.is_valid():
    #     print(form)
    #     form.save()
        # form = DjangoClassForm(request.POST or None)
        # name = regForm.cleaned_data['name']
        # print(name)
        # return render(request, 'DjangoClass', context) 


    
    return render(request, 'djangoClass.html', context)


# def raw_html_view(request):
#     context = {}
#     return render(request,"newForms.html",(context))

class DjangoClassSerializerView(viewsets.ModelViewSet):
    queryset  = DjangoClass.objects.all()
    serializer_class = DjangoClassSerializer