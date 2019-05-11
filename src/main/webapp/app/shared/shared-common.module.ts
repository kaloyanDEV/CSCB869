import { NgModule } from '@angular/core';

import { EregistrySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
  imports: [EregistrySharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent],
  exports: [EregistrySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class EregistrySharedCommonModule {}
