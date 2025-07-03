import { CanActivateChildFn, Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { inject } from '@angular/core';

export const childGuard: CanActivateChildFn = (childRoute, state) => {

  const auth = inject(AuthService);
  const router = inject(Router);

  if (auth.isLoggedIn())
    return true;

  alert('Access denied');
  router.navigate(['admin/login']);
  return false;
  
};
