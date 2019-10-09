from django import forms
from .models import DjangoClass

class DjangoClassForm(forms.ModelForm):
	# name = forms.CharField(label='this is a label')
	# nickname = forms.CharField()
	# age = forms.IntegerField()
	# cover = forms.ImageField()

	class Meta:
		model = DjangoClass
		fields = [
			'id',
			'name',
			'nickname',
			'age',
			
		]

# , widget=forms.TextInput('')