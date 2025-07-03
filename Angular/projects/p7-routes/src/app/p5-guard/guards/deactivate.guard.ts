import { CanDeactivateFn } from '@angular/router';
import { FormstateService } from '../formstate.service';
import { inject } from '@angular/core';

export const deactivateGuard: CanDeactivateFn<unknown> = (component, currentRoute, currentState, nextState) => {
  
  const formState = inject(FormstateService);
 
  return !formState.hasUnsavedChanges || confirm('You have unsaved changes. Leave anyway?');

};
