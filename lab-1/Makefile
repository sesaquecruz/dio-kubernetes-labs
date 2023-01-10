up: create-docker-images create-k8s-database create-k8s-backend create-k8s-frontend
	@echo "Done."

down: delete-k8s-frontend delete-k8s-backend delete-k8s-database
	@echo "Done."

create-docker-images:
	cd database; ./database.sh
	cd backend; ./backend.sh
	cd frontend; ./frontend.sh

create-k8s-database:
	cd kubernetes/database; kubectl apply -f database-pv.yml
	cd kubernetes/database; kubectl apply -f database-pvc.yml
	cd kubernetes/database; kubectl apply -f database-deployment.yml
	cd kubernetes/database; kubectl apply -f database-service.yml

create-k8s-backend:
	cd kubernetes/backend; kubectl apply -f backend-deployment.yml
	cd kubernetes/backend; kubectl apply -f backend-service.yml

create-k8s-frontend:
	cd kubernetes/frontend; kubectl apply -f frontend-deployment.yml
	cd kubernetes/frontend; kubectl apply -f frontend-service.yml

delete-k8s-database:
	kubectl delete service database-connection
	kubectl delete deployment database
	kubectl delete pvc database-pvc
	kubectl delete pv database-pv

delete-k8s-backend:
	kubectl delete service backend-connection
	kubectl delete deployment backend

delete-k8s-frontend:
	kubectl delete service frontend-connection
	kubectl delete deployment frontend

show-status:
	kubectl get pv
	@echo "\n"
	kubectl get pvc
	@echo "\n"
	kubectl get deployment
	@echo "\n"
	kubectl get service
	@echo "\n"
	@echo 'For minikube run [minikube tunnel] to create an "EXTERNAL-IP"'