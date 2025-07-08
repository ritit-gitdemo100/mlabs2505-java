import { HttpInterceptorFn } from '@angular/common/http';

export const authInterceptor: HttpInterceptorFn = (req, next) => {

  //set a token after login response in a specific component
  localStorage.setItem('authToken','Marlabs12345');

  const token = localStorage.getItem('authToken');
  const authReq = token
    ? req.clone({
      setHeaders: { Authorization: `Bearer ${token}` }
    })
    : req;

  return next(authReq);
};
