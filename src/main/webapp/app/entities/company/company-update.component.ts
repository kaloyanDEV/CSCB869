import { Component, OnInit } from '@angular/core';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { ICompany, Company } from 'app/shared/model/company.model';
import { CompanyService } from './company.service';

@Component({
  selector: 'jhi-company-update',
  templateUrl: './company-update.component.html'
})
export class CompanyUpdateComponent implements OnInit {
  company: ICompany;
  isSaving: boolean;

  editForm = this.fb.group({
    id: [],
    name: [null, [Validators.required, Validators.minLength(2)]],
    manager: [],
    founded: [],
    startCapital: [],
    address: [],
    activity: [],
    type: []
  });

  constructor(protected companyService: CompanyService, protected activatedRoute: ActivatedRoute, private fb: FormBuilder) {}

  ngOnInit() {
    this.isSaving = false;
    this.activatedRoute.data.subscribe(({ company }) => {
      this.updateForm(company);
      this.company = company;
    });
  }

  updateForm(company: ICompany) {
    this.editForm.patchValue({
      id: company.id,
      name: company.name,
      manager: company.manager,
      founded: company.founded,
      startCapital: company.startCapital,
      address: company.address,
      activity: company.activity,
      type: company.type
    });
  }

  previousState() {
    window.history.back();
  }

  save() {
    this.isSaving = true;
    const company = this.createFromForm();
    if (company.id !== undefined) {
      this.subscribeToSaveResponse(this.companyService.update(company));
    } else {
      this.subscribeToSaveResponse(this.companyService.create(company));
    }
  }

  private createFromForm(): ICompany {
    const entity = {
      ...new Company(),
      id: this.editForm.get(['id']).value,
      name: this.editForm.get(['name']).value,
      manager: this.editForm.get(['manager']).value,
      founded: this.editForm.get(['founded']).value,
      startCapital: this.editForm.get(['startCapital']).value,
      address: this.editForm.get(['address']).value,
      activity: this.editForm.get(['activity']).value,
      type: this.editForm.get(['type']).value
    };
    return entity;
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<ICompany>>) {
    result.subscribe((res: HttpResponse<ICompany>) => this.onSaveSuccess(), (res: HttpErrorResponse) => this.onSaveError());
  }

  protected onSaveSuccess() {
    this.isSaving = false;
    this.previousState();
  }

  protected onSaveError() {
    this.isSaving = false;
  }
}
