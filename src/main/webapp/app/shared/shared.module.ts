import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { EregistrySharedLibsModule, EregistrySharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [EregistrySharedLibsModule, EregistrySharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [EregistrySharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class EregistrySharedModule {
  static forRoot() {
    return {
      ngModule: EregistrySharedModule
    };
  }
}
