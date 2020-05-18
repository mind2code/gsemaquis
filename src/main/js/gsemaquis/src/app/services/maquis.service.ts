import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Maquis } from '../models/maquis.model';

@Injectable({
  providedIn: 'root'
})
export class MaquisService {
  
  constructor(private http: HttpClient) { }

  getMaquis(): Observable<Maquis[]> {
    return this.http.get<Maquis[]>('http://localhost:8082/api/maquis');
  }
}
