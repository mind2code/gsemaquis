import { TestBed } from '@angular/core/testing';

import { MaquisService } from './maquis.service';

describe('MaquisService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MaquisService = TestBed.get(MaquisService);
    expect(service).toBeTruthy();
  });
});
