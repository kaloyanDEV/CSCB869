export const enum Activity {
  A1 = 'A1',
  A2 = 'A2'
}

export const enum Type {
  T1 = 'T1',
  T2 = 'T2',
  T3 = 'T3',
  T4 = 'T4'
}

export interface ICompany {
  id?: number;
  name?: string;
  manager?: string;
  founded?: number;
  startCapital?: number;
  address?: string;
  activity?: Activity;
  type?: Type;
}

export class Company implements ICompany {
  constructor(
    public id?: number,
    public name?: string,
    public manager?: string,
    public founded?: number,
    public startCapital?: number,
    public address?: string,
    public activity?: Activity,
    public type?: Type
  ) {}
}
