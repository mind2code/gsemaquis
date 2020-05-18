import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MaquisComponent } from './maquis.component';

describe('MaquisComponent', () => {
  let component: MaquisComponent;
  let fixture: ComponentFixture<MaquisComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MaquisComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MaquisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
