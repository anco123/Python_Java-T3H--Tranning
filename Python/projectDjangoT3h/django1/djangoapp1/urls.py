from django.urls import path, include

from djangoapp1.views import (
    home_page,
    about_page,
    contact_page,
    index,
    extend_page,
    django_class_view,
    all_view,
    forms_view,
    DjangoClassSerializerView
    # raw_html_view
    
)
from rest_framework import routers

router = routers.DefaultRouter()
router.register(r'class', DjangoClassSerializerView)

urlpatterns = [
    path('', home_page, name='index'),
    path('about/', about_page),
    path('contact/', contact_page,),
    path('insert/', index),
    path('extend/',extend_page),
    path('djangoClass/', django_class_view),
    path('allobjetcs/', all_view),
    path('form/',forms_view),
    # path('raw/',raw_html_view),
    # path('dataJson/', include(router.urls)),  trong link url'' có một số keyword không được phép đặt, ví dụ như 'api nếu như đặt nó sẽ không nhận url đó'
    path('api-auth/', include('rest_framework.urls', namespace='rest_framework'))
]