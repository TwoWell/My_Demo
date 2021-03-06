from django.conf.urls import url
from . import views

urlpatterns = [
	url(r'^register/$',views.register),
	url(r'^register_handle/$',views.register_handle),
	url(r'^login/$',views.login),
	url(r'^logout/$',views.logout),
	url(r'^login_handle/$',views.login_handle),
	url(r'^user_center_info/$',views.user_center_info),
	url(r'^register_exist/$',views.register_exist),
	url(r'^user_center_order/$',views.user_center_order),
	url(r'^user_center_site/$',views.user_center_site),
	url(r'^cart/$',views.cart),
	url(r'^place_order/$',views.place_order),
]