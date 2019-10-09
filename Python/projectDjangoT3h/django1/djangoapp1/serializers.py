from .models import  DjangoClass
from rest_framework import  serializers

class DjangoClassSerializer(serializers.HyperlinkedModelSerializer):
	class Meta:
		model = DjangoClass
		fields = [
				'id',
				'name',
				'nickname',
				'age'
				]

		# exclude = ('cover', )
		